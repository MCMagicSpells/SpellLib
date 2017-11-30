package me.thecomputergeek2.magicspells.msvalidator.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.file.FileCollection
import org.gradle.api.tasks.TaskAction
import org.gradle.api.resources.TextResource
import org.yaml.snakeyaml.Yaml

class YamlValidateTask extends DefaultTask {

    String toValidate = '[key: value]'

    PrintStream outputStream = System.out
    String dumped

    @TaskAction
    void validateFiles() {
        println 'Running validateFiles from YamlValidateTask'
        Yaml yaml = new Yaml()
        def loaded = yaml.load(toValidate);
        dumped = yaml.dump(loaded)
        //outputStream.println(dumped)
    }
}
