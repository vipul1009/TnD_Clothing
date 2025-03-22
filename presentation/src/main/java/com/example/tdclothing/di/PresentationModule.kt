package com.example.tdclothing.di

import org.koin.dsl.module

val presentationModule = module {
    includes(viewModelModule)
}