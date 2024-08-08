# Space game

2018 - Zeynal Zeynalov

#### Sample input data files:
	
Default sample input data from coding document:

		`sampleInputDefault.txt`

Sample inputs when ship trying to pass border lines:

		sampleInputCrossBorderToDirectionEast.txt
		sampleInputCrossBorderToDirectionWest.txt
		sampleInputCrossBorderToDirectionNorth.txt
		sampleInputCrossBorderToDirectionSouth.txt

#### Exceptional cases:
When ship tries to pass boundary lines of zone, current single move instruction will be ignored and next instructions will be performed respectively.

#### Running application:
Input file name should be supplied as argument (args[0]) to the application. When filename is missing, then default input file "sampleInputDefault" will be used.

Java:
	`JavaSE-1.8`