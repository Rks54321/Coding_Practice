import numpy as np
                          # Student_Name,Mat,Sci,CS,Eng,SST
students_array = np.array([['Student_1', 59, 64, 94, 87, 81],

                          ['Student_2', 8, 56, 18, 58, 69],
                          ['Student_3', 7, 20, 60, 63, 42],
                          ['Student_4', 71, 94, 71, 68, 13],
                          ['Student_5', 89, 1, 16, 33, 40],
                          ['Student_6', 4, 25, 48, 41, 84],
                          ['Student_7', 3, 79, 46, 9, 71],
                          ['Student_8', 87, 77, 75, 15, 69],
                          ['Student_9', 61, 1, 48, 98, 23],

                          ['Student_10', 98, 60, 24, 66, 56],

                          ['Student_11', 58, 12, 75, 7, 98],

                          ['Student_12', 23, 62, 6, 35, 37],

                          ['Student_13', 14, 25, 87, 56, 8],

                          ['Student_14', 68, 1, 81, 11, 61],

                          ['Student_15', 11, 69, 35, 17, 66]], dtype=object)
# print(students_array[:,0]) #only student name
# print(students_array[:,1]) #only math
# print((students_array[:,1]).mean()) #avg of math
# print((students_array[:,4]).mean()) #avg of english
# print((students_array[6,1:]).mean()) # only student7 avg
# print(students_array[6,2:5].mean()) #only studnet 7 avg of three sub
# sub1 = students_array[:,1]
# sub2 = students_array[:,2]
# cond = sub1 > sub2
# print('Students who scored higher is subject 1 than subject 2',students_array[cond,0])
# print('Count of Students who scored higher is subject 1 than subject 2',len(students_array[cond,0]))
#
# first_ten_stu = students_array[:10,1:]
# print('Overall Average os first ten student: ', (first_ten_stu).mean())
# print('Student Average of first ten students row wise: ', (first_ten_stu).mean(axis=1)) #axis = 1(row wise average
# print('Student Average of first ten students col wise: ', (first_ten_stu).mean(axis=0)) #axis = 0(col wise average)

#Find the subject average of 1,3 and 4 subjects
# avg_sub = students_array[:,[1,3,4]]
# print('Subject average of 1,2 and 4 subject is ', avg_sub.mean(axis=0))

# Find the subject average of student 4 to studnet 14
# stu_avg_of_stu_5_to_14 = (students_array[4:14,1:]).mean(axis=0)
# print('Subject average of student 4 to studnet 14',stu_avg_of_stu_5_to_14)

# Find all the student names who scored higher than student 15 in both subject1 and subject2
# sub1 = students_array[:,1]
# print(sub1)
# sub2 = students_array[:,2]
# print(sub2)
# stu_15_sub1 = students_array[14,1]
# print(stu_15_sub1)
# stu_15_sub2 = students_array[14,2]
# cond = (sub1 > stu_15_sub1) & (sub2 > stu_15_sub2)
# print('Students 15 subject 1 and subject 2 marks are: ',stu_15_sub1,'and',stu_15_sub2)
# print(students_array[cond, 0:3])


# Find all the student names who scored higher than student 11 either in subject 1 or subject 5
sub1 = students_array[:,1]
sub2 = students_array[:,5]
stu_11_sub1 = students_array[10,1]
stu_11_sub5 = students_array[10,5]
cond = (sub1 > stu_11_sub1) | (sub2 > stu_11_sub5)
print('Students 11 subject 1 or subject 2 marks are: ',stu_11_sub1,'and',stu_11_sub2)
result = students_array[cond]
print(result[:,[0,1,5]])











