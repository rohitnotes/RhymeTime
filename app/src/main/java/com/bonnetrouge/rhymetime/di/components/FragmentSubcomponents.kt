package com.bonnetrouge.rhymetime.di.components

import com.bonnetrouge.rhymetime.fragments.ChallengeFragment
import com.bonnetrouge.rhymetime.fragments.SandboxFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent()
interface SandboxFragmentSubcomponent : AndroidInjector<SandboxFragment> {
    @Subcomponent.Builder abstract class Builder : AndroidInjector.Builder<SandboxFragment>()
}

@Subcomponent()
interface ChallengeFragmentSubcomponent : AndroidInjector<ChallengeFragment> {
    @Subcomponent.Builder abstract class Builder : AndroidInjector.Builder<ChallengeFragment>()
}
