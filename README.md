# DEV-TEST-TAKS-3

The first line of input contains a positive number n, 
next n lines contains pairs of positive integers, where each pair identifies 
a connection between two vertices in a graph.

Application counts how many separated graphs are in the input.
 
Algorithm groups nodes (represented by number) to array. One array represents one graphs. 
 
 For example: on input:
 
 input = [3, 1, 2, 3, 5, 6, 5] 
 
 output will be a size of arrays of graphs:
 
 arrayOfGraphs: <br/>
   &nbsp;&nbsp; - [1,2] (first graph)<br/>
   &nbsp;&nbsp; - [3,5,6] (second graph)
   
 arrayOfGraphs.size = 2
 
 Algorithm: <br>
 input = [X, ...] <br>
 For X times <br> 
 Take first pair <br>
 &nbsp;&nbsp;Check if any of the number from the pair is in any of graphArray in arrayOfGraphs. <br>
 &nbsp;&nbsp;If yes add the pair to suitable graphArray <br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; If found 2 graphArrays join graphArrays to one graphArray <br>
 &nbsp;&nbsp;If not create new graphArray then add pair and add graphArray to arrayOfGraphs <br>
 Repet with next pair <br>
