package grails.plugins.rateable

/* Copyright 2009 Matthew Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 import grails.plugins.rateable.*
 import grails.util.*
 import grails.plugins.*
 
 class RateableGrailsPlugin extends Plugin {

    def grailsVersion = "3.0 > *"
    def dependsOn = [:]
    def pluginExcludes = [
            "grails-app/views/error.gsp",
            "grails/plugins/rateable/Test*",
            "grails/plugins/rateable/UrlMappings*"
    ]

    def author = "Grails Plugin Collective"
    def authorEmail = "info@grails.org"
    def title = "Rateable Plugin"
    def description = "A plugin that adds a generic mechanism for rating domain objects."

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/rateable"

    def license = "APACHE"
    def issueManagement = [ system: "Github", url: "https://github.com/gpc/rateable/issues" ]
    def scm = [ url: "https://github.com/gpc/rateable" ]
}
