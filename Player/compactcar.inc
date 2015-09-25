define LIDAR ranger
(
	sensor (
	pose [ 0 0 -0.1 0 ]
	fov 180.0
	samples 180
	range [ 0.0 0.8 ]
	)
	block (
	points 4
	point[0] [0 0]
	point[1] [0 1]
	point[2] [1 1]
	point[3] [1 0]
	z [0 .26]
	) 
)

define compactcar position
(
	size [.5 .5 .5]
	block
	(
		points 4
		point[0] [0 0]
		point[1] [1 0]
		point[2] [1 1]
		point[3] [0 1]
		z [0 1]
	)
	drive "diff"
	LIDAR()
	localization "gps"
	localization_origin [0 0 0 0]
	obstacle_return 1
	ranger_return 1
	max_speed .5
)

	
