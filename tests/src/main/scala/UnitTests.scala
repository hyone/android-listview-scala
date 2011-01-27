package com.example.androidtest.tests

import junit.framework.Assert._
import _root_.android.test.AndroidTestCase

class UnitTests extends AndroidTestCase {
  def testPackageIsCorrect {
    assertEquals("com.example.androidtest", getContext.getPackageName)
  }
}