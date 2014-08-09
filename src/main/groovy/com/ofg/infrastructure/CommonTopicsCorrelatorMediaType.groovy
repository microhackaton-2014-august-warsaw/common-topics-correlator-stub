package com.ofg.infrastructure

import groovy.transform.TypeChecked

@TypeChecked
class CommonTopicsCorrelatorMediaType {

    public static final String CONTENT_TYPE = "Content-Type"

    protected static final String APPLICATION_TYPE = 'application/vnd.com.ofg.common-topics-correlator'

    private static final String JSON = '+json'

    public static final String V1_JSON = APPLICATION_TYPE + ".v1" + JSON

}
