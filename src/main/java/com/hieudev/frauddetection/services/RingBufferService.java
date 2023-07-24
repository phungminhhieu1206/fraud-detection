package com.hieudev.frauddetection.services;

import com.hieudev.frauddetection.models.FakeDTO;

public interface RingBufferService {
    public String checkFakeByScore(FakeDTO fakeDTO);
}
