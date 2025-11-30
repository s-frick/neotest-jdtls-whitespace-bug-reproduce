# neotest-jdtls Whitespace Bug Reproducer

This minimal Maven project reproduces the whitespace mismatch bug in `neotest-jdtls` where
`@ParameterizedTest` signatures (`Price,String` vs `Price, String`) cause test ID lookup failures.

