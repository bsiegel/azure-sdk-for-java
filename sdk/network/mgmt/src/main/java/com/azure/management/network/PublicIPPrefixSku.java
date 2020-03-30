// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PublicIPPrefixSku model.
 */
@Fluent
public final class PublicIPPrefixSku {
    /*
     * Name of a public IP prefix SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of PublicIPPrefixSku class.
     */
    public PublicIPPrefixSku() {
        name = "Standard";
    }

    /**
     * Get the name property: Name of a public IP prefix SKU.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of a public IP prefix SKU.
     * 
     * @param name the name value to set.
     * @return the PublicIPPrefixSku object itself.
     */
    public PublicIPPrefixSku withName(String name) {
        this.name = name;
        return this;
    }
}