/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the DoubleWrapper class.
 * @constructor
 * @member {number} [field1]
 * 
 * @member {number}
 * [field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose]
 * 
 */
function DoubleWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.field1 !== null && parameters.field1 !== undefined) {
      this.field1 = parameters.field1;
    }
    if (parameters.field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose !== null && parameters.field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose !== undefined) {
      this.field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose = parameters.field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose;
    }
  }    
}


/**
 * Validate the payload against the DoubleWrapper schema
 *
 * @param {JSON} payload
 *
 */
DoubleWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['field1'] !== null && this['field1'] !== undefined) {
    if (typeof this['field1'] !== 'number') {
      throw new Error('this[\'field1\'] must be of type number.');
    }
    payload['field1'] = this['field1'];
  }

  if (this['field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose'] !== null && this['field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose'] !== undefined) {
    if (typeof this['field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose'] !== 'number') {
      throw new Error('this[\'field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose\'] must be of type number.');
    }
    payload['field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose'] = this['field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose'];
  }

  return payload;
};

/**
 * Deserialize the instance to DoubleWrapper schema
 *
 * @param {JSON} instance
 *
 */
DoubleWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['field1'] !== null && instance['field1'] !== undefined) {
      this['field1'] = instance['field1'];
    }

    if (instance['field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose'] !== null && instance['field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose'] !== undefined) {
      this['field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose'] = instance['field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose'];
    }
  }

  return this;
};

module.exports = DoubleWrapper;
