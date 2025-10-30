#!/usr/bin/env bash

npx @openapitools/openapi-generator-cli -g

generate_api_code () {
  local temp_spec_file_name="_spec.json"
  local json_file_path=$1
  local output_folder=$2
  local package_name=$3
  cp $json_file_path $temp_spec_file_name
  openapi-generator-cli generate -i $temp_spec_file_name -g kotlin -o $output_folder --additional-properties apiSuffix=Api,omitGradleWrapper=true,omitGradlePluginVersions=true,useSettingsGradle=false,supportingFiles=false,packageName=$package_name
  rm $temp_spec_file_name
}

generate_api_code "path to json" "./generated/output" "packageName"


