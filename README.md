<p align="center">
  <img width="1080" height="360" src="https://assets.leetcode.com/static_assets/public/images/LeetCode_Sharing.png">
</p>

# Leetcode
Solution for problems in leetcode.com

# How to contribute

## Step 0: Star and Fork this Repository

You can star and fork this repository on GitHub by navigating at the top of this repository.

When you’re on the main page of a repository, you’ll see a button to "Star" and “Fork” the repository on the upper right-hand side of the page, underneath your user icon.

## Step 1: Picking up an issue

If working on an issue, comment first that you are working on it and then send out the pull request.

## Step 2: Folder structure and conventions

### Folder structure:

1. **If only single solution exists**        
`#<problem_number>/<programming_language>/<file_name>`

**Example**
```
#200/java/Solution.java
```

2. **If more than one approach exist**        
`#<problem_number>/<programming_language>/<approach_algorithm_name>/<file_name>`

**Example**
```
#354/java/dfs/Solution.java
#354/java/union_find/Solution.java
#354/kotlin/dfs/Solution.kt
#354/kotlin/union_find/Solution.kt
```

3. The code should start with comment section having the problem link.

**Example**
```
/**
 * https://leetcode.com/problems/gas-station/
 */
 class Solution { .... }
```

Note: the algorithm name (if multiple words) follows snake case.

4. In the comment section, after adding the problem link, add the `runtime beat %` and `memory usage beats %` provided by leetcode after submission of the code.

**Example**
```
/**
 * https://leetcode.com/problems/gas-station/
 * runtime beats 45.76% of Java submissions
 * memory usage beats 77.23% of Java submissions
 */
 class Solution { .... }
```

## Step 3: Pull Request

1. While sending out pull request, also attach proof of submission as accepted solution for the code.
2. A single pull request should only address a single issue, i.e. solution for a single leetcode problem. It can include multiple files for multiple unique solutions(approaches) but only for a single problem. 

## What next?

1. After sending out the PR, consider SLA of 2 days for review of the PR and getting a response back. In case of SLA failure, feel free to leave comment asking for review or merge.
2. Feel free to open new issues for different leetcode questions. I will assign the `hacktoberfest` tag while you can send out PR without waiting.
