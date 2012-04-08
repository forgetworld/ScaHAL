package org.scahal.classifier

import org.specs2.Specification
import com.recursivity.math._

/**
 * Created with IntelliJ IDEA.
 * User: wfaler
 * Date: 08/04/2012
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */

class GaussianFunctionSpec extends Specification{ def is =

  "The Gaussian Function should" ^
    p^
      "be return approximately 0.034 given a mean=73, stdDev=6.2 and value of 66" ! gaussianProb^
  end

  def gaussianProb = {
    GaussianFunction(73, 6.2, 66) must be_==(dec(0.03401870545760999))
  }

}