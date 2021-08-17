package com.github.zhangfuwen.ideaplugin.services

import com.github.zhangfuwen.ideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
