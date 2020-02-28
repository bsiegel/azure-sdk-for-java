/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Patch for a Big Data pool.
 * Properties patch for a Big Data pool.
 */
public class BigDataPoolPatchInfo {
    /**
     * Updated tags for the Big Data pool.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get updated tags for the Big Data pool.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set updated tags for the Big Data pool.
     *
     * @param tags the tags value to set
     * @return the BigDataPoolPatchInfo object itself.
     */
    public BigDataPoolPatchInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}