package com.hieudev.frauddetection.services;

import com.hieudev.frauddetection.models.FakeDTO;

public interface FakeService {
    public boolean isInBlackList(FakeDTO fakeDTO);
    public String checkFake(FakeDTO fakeDTO);
    public void saveToRingBuffer(FakeDTO fakeDTO);
}
