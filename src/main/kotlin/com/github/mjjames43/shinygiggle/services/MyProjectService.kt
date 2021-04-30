package com.github.mjjames43.shinygiggle.services

import com.github.mjjames43.shinygiggle.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
