Feature: Mathematical operation in calculator
	As a user
	I Want to use a calculator to perform an operation
	And check the result

	Scenario Outline: Calculating with basic arithmetic operations - Sum
	When I add <number1> and <number2>
	Then the result should be <result>
	Examples:
      | number1 | number2 | result |
      | 4       | 7       | 11     |

	Scenario Outline: Calculating with basic arithmetic operations - Subtract
	When I subtract <number1> and <number2>
	Then the result should be <result>
	Examples:
      | number1 | number2 | result |
      | 9       | 2       | 7      |

	Scenario Outline: Calculating with basic arithmetic operations - Multiply
	When I multiply <number1> and <number2>
	Then the result should be <result>
	Examples:
      | number1 | number2 | result |
      | 3       | 6       | 18     |

	Scenario Outline: Calculating with basic arithmetic operations - Divide
	When I divide <number1> and <number2>
	Then the result should be <result>
	Examples:
      | number1 | number2 | result |
      | 9       | 3       | 3      |