package ir.cena.dagger.di

import dagger.Component
import ir.cena.dagger.Zcript

@Component
interface LearningComponent {

    fun getZcript(): Zcript
}