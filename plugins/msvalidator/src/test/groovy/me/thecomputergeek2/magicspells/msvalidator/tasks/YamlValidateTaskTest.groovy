package me.thecomputergeek2.magicspells.msvalidator.tasks

import spock.lang.Specification
import org.gradle.api.Plugin
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project

class YamlValidateTaskTest extends Specification {
    def "basic validation test"() {
        setup:
        println 'setup'
        Project project = ProjectBuilder.builder().build()
        project.task('validateyaml', type: me.thecomputergeek2.magicspells.msvalidator.tasks.YamlValidateTask) {
            toValidate = '[key1: value1, key2: value2]'
        }
        when:
        project.validateyaml.execute()
        println project.validateyaml.dumped

        then:
        noExceptionThrown()
    }

}
