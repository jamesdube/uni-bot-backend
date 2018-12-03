package com.jamesdube.unibot.controllers;

import com.jamesdube.unibot.utils.requests.RecommendationRequest;
import com.jamesdube.unibot.business.services.RecommendationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    private RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @PostMapping("/recommendation")
    public void create(@RequestBody RecommendationRequest recommendationRequest){

        System.out.println("incoming request: " + recommendationRequest.toString());

        System.out.println("pre recoo: ");
        recommendationService
              .createRecommendation(recommendationRequest);


    }
}
