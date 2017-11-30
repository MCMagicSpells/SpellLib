package me.thecomputergeek2.magicspells.msvalidator

import org.gradle.api.Project
import org.gradle.api.Plugin

class MSValidatorPlugin implements Plugin<Project> {

   void apply(Project project) {
       def extension = project.extensions.create('msvalidator', ValidatorPluginExtension, project)
        project.task('hello') {
            doLast {
                println 'Hello from the MSValidator'
            }
        }
    }

}

class ValidatorPluginExtension {
    // TODO get the library sets
    // TODO get the output directory
}
