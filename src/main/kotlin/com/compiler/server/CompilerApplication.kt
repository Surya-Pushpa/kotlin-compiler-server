package com.compiler.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
class CompilerApplication : SpringBootServletInitializer()

fun main(args: Array<String>) {
  runApplication<CompilerApplication>(*args)
}
