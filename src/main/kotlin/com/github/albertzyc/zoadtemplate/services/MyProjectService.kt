package com.github.albertzyc.zoadtemplate.services

import com.intellij.openapi.project.Project
import com.github.albertzyc.zoadtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
