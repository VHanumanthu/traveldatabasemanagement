package com.example.travelmanagement.external;

import org.springframework.stereotype.Service;

@Service
public class TravelApiService {

    public TravelApiResponse getTravelInfo(String destination, String date) {
        
    	TravelApiResponse response = new TravelApiResponse();
        response.setDestination(destination);
        response.setDate1(date);
        response.setInfo("Travel information retrieved from external API.");
        return response;
    }
    }
  

