package com.ofg.topics

import com.ofg.infrastructure.Stub
import groovy.transform.TypeChecked

import static com.github.tomakehurst.wiremock.client.WireMock.*
import static com.ofg.infrastructure.CommonTopicsCorrelatorMediaType.CONTENT_TYPE
import static com.ofg.infrastructure.CommonTopicsCorrelatorMediaType.V1_JSON

@TypeChecked
class PairIdControllerStubs {

    @Stub
    public static void correlateTopics() {
        stubFor(
                post(urlMatching('/correlations'))
                        .withHeader(CONTENT_TYPE, equalTo(V1_JSON))
                        .willReturn(aResponse()
                        .withStatus(200)
                ))

    }

}
