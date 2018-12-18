organization = "SDP-Apps-Organization"
libraries{
  newman{
    dev_Run_Newman_Tests = true
    test_Run_Newman_Tests = true
    staging_Run_Newman_Tests = true
    prod_Run_Newman_Tests = true
  }
  syntax_unit_testing{
    dev_Skip_Tests = true
    test_Skip_Tests = true
    staging_Skip_Tests = true
    prod_Skip_Tests = true
  }
}
