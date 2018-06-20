/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.RouteType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * Virtual Network route contract used to pass routing information for a
 * Virtual Network.
 */
@JsonFlatten
public class VnetRouteInner extends ProxyOnlyResource {
    /**
     * The starting address for this route. This may also include a CIDR
     * notation, in which case the end address must not be specified.
     */
    @JsonProperty(value = "properties.startAddress")
    private String startAddress;

    /**
     * The ending address for this route. If the start address is specified in
     * CIDR notation, this must be omitted.
     */
    @JsonProperty(value = "properties.endAddress")
    private String endAddress;

    /**
     * The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges
     * specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     *
     * These values will be used for syncing an app's routes with those from a
     * Virtual Network. Possible values include: 'DEFAULT', 'INHERITED',
     * 'STATIC'.
     */
    @JsonProperty(value = "properties.routeType")
    private RouteType routeType;

    /**
     * Get the starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     *
     * @return the startAddress value
     */
    public String startAddress() {
        return this.startAddress;
    }

    /**
     * Set the starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     *
     * @param startAddress the startAddress value to set
     * @return the VnetRouteInner object itself.
     */
    public VnetRouteInner withStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }

    /**
     * Get the ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     *
     * @return the endAddress value
     */
    public String endAddress() {
        return this.endAddress;
    }

    /**
     * Set the ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     *
     * @param endAddress the endAddress value to set
     * @return the VnetRouteInner object itself.
     */
    public VnetRouteInner withEndAddress(String endAddress) {
        this.endAddress = endAddress;
        return this;
    }

    /**
     * Get the type of route this is:
     DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     INHERITED - Routes inherited from the real Virtual Network routes
     STATIC - Static route set on the app only
     These values will be used for syncing an app's routes with those from a Virtual Network. Possible values include: 'DEFAULT', 'INHERITED', 'STATIC'.
     *
     * @return the routeType value
     */
    public RouteType routeType() {
        return this.routeType;
    }

    /**
     * Set the type of route this is:
     DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     INHERITED - Routes inherited from the real Virtual Network routes
     STATIC - Static route set on the app only
     These values will be used for syncing an app's routes with those from a Virtual Network. Possible values include: 'DEFAULT', 'INHERITED', 'STATIC'.
     *
     * @param routeType the routeType value to set
     * @return the VnetRouteInner object itself.
     */
    public VnetRouteInner withRouteType(RouteType routeType) {
        this.routeType = routeType;
        return this;
    }

}
