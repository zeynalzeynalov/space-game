# space-game
Space ships game

2018
Zeynal Zeynalov
	
Sample input data files:
	Default sample input data from coding document:
		sampleInputDefault.txt

	Sample inputs when ship trying to pass border lines:
		sampleInputCrossBorderToDirectionEast.txt
		sampleInputCrossBorderToDirectionWest.txt
		sampleInputCrossBorderToDirectionNorth.txt
		sampleInputCrossBorderToDirectionSouth.txt
	
Exceptional cases:
	When ship tries to pass boundry lines of zone, current single move instruction will be
	ignored and next instructions will be performed respectively.
	
Running application:
	Input file name should be supplied as argument (args[0]) to the application. When filename is missiong,
	then default input file "sampleInputDefault" will be used.
		
Development IDE: 
	Eclipse IDE for Java Developers
	Version: Photon Release (4.8.0)
	
Java:
	JavaSE-1.8