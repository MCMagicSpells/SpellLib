package me.thecomputergeek2.magicspells.importer

import org.gradle.api.Project
import org.gradle.api.Plugin

class ImporterPlugin implements Plugin<Project> {

   void apply(Project project) {
       def extension = project.extensions.create('msimporter', ImporterPluginExtension, project)
        project.task('hello') {
            doLast {
                println 'Hello from the Importers'
            }
        }
    }

}

class ImporterPluginExtension {
    // TODO get the library sets
    // TODO get the output directory
}
