// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VirtualNetworkRule model.
 */
@Fluent
public final class VirtualNetworkRule {
    /*
     * The action of virtual network rule.
     */
    @JsonProperty(value = "action")
    private Action action;

    /*
     * Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     */
    @JsonProperty(value = "id", required = true)
    private String virtualNetworkResourceId;

    /**
     * Get the action property: The action of virtual network rule.
     * 
     * @return the action value.
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action property: The action of virtual network rule.
     * 
     * @param action the action value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get the virtualNetworkResourceId property: Resource ID of a subnet, for
     * example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     * @return the virtualNetworkResourceId value.
     */
    public String virtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    /**
     * Set the virtualNetworkResourceId property: Resource ID of a subnet, for
     * example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     * @param virtualNetworkResourceId the virtualNetworkResourceId value to
     * set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withVirtualNetworkResourceId(String virtualNetworkResourceId) {
        this.virtualNetworkResourceId = virtualNetworkResourceId;
        return this;
    }
}