package com.poc.core

import android.content.Context
import android.view.View
import android.view.ViewGroup

interface MFEViewProvider : MFEProvider{
    fun inflate(context: Context, parent: ViewGroup?, navigationId : Int): View
}