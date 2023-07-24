package com.hieudev.frauddetection.services.impl;

import com.hieudev.frauddetection.config.Config;
import com.hieudev.frauddetection.models.FakeDTO;
import com.hieudev.frauddetection.repositories.BlackList;
import com.hieudev.frauddetection.repositories.RingBuffer;
import com.hieudev.frauddetection.services.FakeService;
import com.hieudev.frauddetection.services.RingBufferService;

import java.util.Date;

public class FakeServiceImpl implements FakeService {
    RingBufferService ringBufferService = new RingBufferServiceImpl();

    @Override
    public boolean isInBlackList(FakeDTO fakeDTO) {
        return BlackList.SDT.contains(fakeDTO.getSdt()) ||
               BlackList.IMEI.contains(fakeDTO.getImei()) ||
               BlackList.IP.contains(fakeDTO.getIp()) ||
               BlackList.GTTT.contains(fakeDTO.getGttt());
    }

    @Override
    public String checkFake(FakeDTO fakeDTO) {
        if (isInBlackList(fakeDTO)) {
            // thêm vào ring buffer
            saveToRingBuffer(fakeDTO);
            return Config.FAKE_RESULT;
        } else {
            // Không có factor nào thuộc black list --> Tính điểm, so ngưỡng để return fake or not
            return ringBufferService.checkFakeByScore(fakeDTO);
        }
    }

    @Override
    public void saveToRingBuffer(FakeDTO fakeDTO) {
        // Lưu vào redis
        Date date = new Date();
        if (!BlackList.SDT.contains(fakeDTO.getSdt())) {
            RingBuffer.SDT.put(fakeDTO.getSdt(), date.getTime());
        }
        if (!BlackList.IMEI.contains(fakeDTO.getImei())) {
            RingBuffer.IMEI.put(fakeDTO.getImei(), date.getTime());
        }
        if (!BlackList.IP.contains(fakeDTO.getIp())) {
            RingBuffer.IP.put(fakeDTO.getIp(), date.getTime());
        }
        if (!BlackList.GTTT.contains(fakeDTO.getGttt())) {
            RingBuffer.GTTT.put(fakeDTO.getGttt(), date.getTime());
        }
    }
}
