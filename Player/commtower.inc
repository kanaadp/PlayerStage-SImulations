define commtower position
(
	size [.125 .125 2.5]
	block
	(
		points 4
		point[0] [0 0]
		point[1] [1 0]
		point[2] [1 1]
		point[3] [0 1]
		z [0 5]
	)
	drive "diff"
	localization_origin [0 0 0 0]
	obstacle_return 0
	ranger_return 0
)
