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
 * Initializes a new instance of the DictionaryWrapper class.
 * @constructor
 * @member {object} [defaultProgram]
 * 
 */
function DictionaryWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.defaultProgram !== null && parameters.defaultProgram !== undefined) {
      for(var valueElement in parameters.defaultProgram) {
        if (parameters.defaultProgram[valueElement] !== null && parameters.defaultProgram[valueElement] !== undefined) {
          this.defaultProgram[valueElement] = parameters.defaultProgram[valueElement];
        }
      }
    }
  }    
}


/**
 * Validate the payload against the DictionaryWrapper schema
 *
 * @param {JSON} payload
 *
 */
DictionaryWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['defaultProgram'] && typeof this['defaultProgram'] === 'object') {
    payload['defaultProgram'] = {}
    for(var valueElement1 in this['defaultProgram']) {
      if (this['defaultProgram'][valueElement1] !== null && this['defaultProgram'][valueElement1] !== undefined) {
        if (typeof this['defaultProgram'][valueElement1].valueOf() !== 'string') {
          throw new Error('this[\'defaultProgram\'][valueElement1] must be of type string.');
        }
        payload['defaultProgram'][valueElement1] = this['defaultProgram'][valueElement1];
      }
    }
  }

  return payload;
};

/**
 * Deserialize the instance to DictionaryWrapper schema
 *
 * @param {JSON} instance
 *
 */
DictionaryWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['defaultProgram'] !== null && instance['defaultProgram'] !== undefined) {
      for(var valueElement2 in instance['defaultProgram']) {
        if (instance['defaultProgram'][valueElement2] !== null && instance['defaultProgram'][valueElement2] !== undefined) {
          this['defaultProgram'][valueElement2] = instance['defaultProgram'][valueElement2];
        }
      }
    }
  }

  return this;
};

module.exports = DictionaryWrapper;
