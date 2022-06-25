package com.github.julianfun123.pastefyintellij.services

import com.intellij.openapi.project.Project
import com.github.julianfun123.pastefyintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
