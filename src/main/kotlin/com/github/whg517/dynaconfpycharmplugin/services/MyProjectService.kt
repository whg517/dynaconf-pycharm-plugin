package com.github.whg517.dynaconfpycharmplugin.services

import com.github.whg517.dynaconfpycharmplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
