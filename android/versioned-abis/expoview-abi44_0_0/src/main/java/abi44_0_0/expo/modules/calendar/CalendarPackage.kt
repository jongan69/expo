package abi44_0_0.expo.modules.calendar

import android.content.Context
import abi44_0_0.expo.modules.core.BasePackage

class CalendarPackage : BasePackage() {
  override fun createExportedModules(context: Context) = listOf(CalendarModule(context))
}
