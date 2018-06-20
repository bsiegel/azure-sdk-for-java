/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.ServiceEndpointPropertiesFormat;
import com.microsoft.azure.management.network.v2018_05_01.IPConfiguration;
import com.microsoft.azure.management.network.v2018_05_01.ResourceNavigationLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Subnet in a virtual network resource.
 */
@JsonFlatten
public class SubnetInner extends SubResource {
    /**
     * The address prefix for the subnet.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /**
     * The reference of the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private NetworkSecurityGroupInner networkSecurityGroup;

    /**
     * The reference of the RouteTable resource.
     */
    @JsonProperty(value = "properties.routeTable")
    private RouteTableInner routeTable;

    /**
     * An array of service endpoints.
     */
    @JsonProperty(value = "properties.serviceEndpoints")
    private List<ServiceEndpointPropertiesFormat> serviceEndpoints;

    /**
     * Gets an array of references to the network interface IP configurations
     * using subnet.
     */
    @JsonProperty(value = "properties.ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<IPConfiguration> ipConfigurations;

    /**
     * Gets an array of references to the external resources using subnet.
     */
    @JsonProperty(value = "properties.resourceNavigationLinks")
    private List<ResourceNavigationLink> resourceNavigationLinks;

    /**
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the address prefix for the subnet.
     *
     * @return the addressPrefix value
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the address prefix for the subnet.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the reference of the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the reference of the NetworkSecurityGroup resource.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the reference of the RouteTable resource.
     *
     * @return the routeTable value
     */
    public RouteTableInner routeTable() {
        return this.routeTable;
    }

    /**
     * Set the reference of the RouteTable resource.
     *
     * @param routeTable the routeTable value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withRouteTable(RouteTableInner routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get an array of service endpoints.
     *
     * @return the serviceEndpoints value
     */
    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        return this.serviceEndpoints;
    }

    /**
     * Set an array of service endpoints.
     *
     * @param serviceEndpoints the serviceEndpoints value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }

    /**
     * Get gets an array of references to the network interface IP configurations using subnet.
     *
     * @return the ipConfigurations value
     */
    public List<IPConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get gets an array of references to the external resources using subnet.
     *
     * @return the resourceNavigationLinks value
     */
    public List<ResourceNavigationLink> resourceNavigationLinks() {
        return this.resourceNavigationLinks;
    }

    /**
     * Set gets an array of references to the external resources using subnet.
     *
     * @param resourceNavigationLinks the resourceNavigationLinks value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withResourceNavigationLinks(List<ResourceNavigationLink> resourceNavigationLinks) {
        this.resourceNavigationLinks = resourceNavigationLinks;
        return this;
    }

    /**
     * Get the provisioning state of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
