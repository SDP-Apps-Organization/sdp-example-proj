organization = "SDP-Apps-Organization"
libraries{
  newman{
    dev_Run_Newman_Tests = false
    test_Run_Newman_Tests = false
    staging_Run_Newman_Tests = false
    prod_Run_Newman_Tests = false
  }
  syntax_unit_testing{
    dev_Skip_Tests = true
    test_Skip_Tests = true
    staging_Skip_Tests = true
    prod_Skip_Tests = true
  }
}
