package first_git_project;

public class MySevenClass_Info {
    public static void main(String[] args) {
        System.out.println(

                "*****GIT DAY1*****\n" +
                        "1. Create a project\n" +
                        "2. Create a GITHUB REPOSITORY\n" +
                        "    *go to github\n" +
                        "    *Repositories>Create New Repository> first_git_project\n" +
                        "3. Create a FIRST COMMIT for the First time\n" +
                        "ONLY ONCE    *git init\n" +
                        "EVERY TIME    *git add .\n" +
                        "EVERY TIME    *git commit -m \"first commit\"\n" +
                        "ONLY ONCE    *git branch -M main\n" +
                        "ONLY ONCE    *git remote add origin https://github.com/abayramus/first_git_project.git\n" +
                        "ONLY ONCE    *git push -u origin main\n" +
                        "    *****Then your code should be pushed to github. REFRESH YOUR PAGE TO SEE THE CODE\n" +
                        "NOTE: git status    ->   This is our friend. This can be used anytime to see the progress\n" +
                        "4. Create a new SECOND COMMIT\n" +
                        "    *Create a new java class under first_git_package: MySecondClass\n" +
                        "    *Create a new commit and push the code to github\n" +
                        "        * git add .\n" +
                        "        * git commit -m \"added my second java class\"\n" +
                        "        * git push\n" +
                        "5. ADDING SPECIFIC FILES\n" +
                        "    *Create 2 JAVA classes : MyThirdClass, MyFourthClass\n" +
                        "    *Create a commit with ONLY myFourthClass\n" +
                        "        *git add \"src/first_git_package/MyFourthClass.java\"\n" +
                        "        *git commit -m \"adding fourth class\"\n" +
                        "        *git push\n" +
                        "6. GIT PULL\n" +
                        "    *git pull is used to get the code from github\n" +
                        "    *git pull = git fetch + git merge\n" +
                        "        NOTE: if git pull trows error then use:\n" +
                        "        git fetch\n" +
                        "        git merge\n" +
                        "    * NOW THAT WE HAVE OUR LOCAL UPDATED, THEN COMMIT THE CODES AND PUSH ALL TOGETHER\n" +
                        "        *git add .\n" +
                        "        *git commit -m \"committing my codes\"\n" +
                        "        *git push\n" +
                        "NOTE: PULL BEFORE PUSH\n" +
                        "        *git pull -> git add . -> git commit -m \"message\" -> git push\n" +
                        "**********************DAY 1 SUMMARY***********************************\n" +
                        "*****Prerequisites :\n" +
                        "*Git Install\n" +
                        "*GitHub account\n" +
                        "*Git Authentication(create token, add username and token so your account verification is complete)\n" +
                        "*****First Time Git Push*****\n" +
                        "*FOLLOW THE INSTRUCTION IN OUR GITHUB REPOSITORY\n" +
                        "    git init\n" +
                        "    git add .\n" +
                        "    git commit -m \"first commit\"\n" +
                        "    git branch -M main\n" +
                        "    git remote add origin https://github.com/abayramus/demo-repo.git\n" +
                        "    git push -u origin main\n" +
                        "*NOTE : If you get error, just google the error message,...\n" +
                        "*****Second Time Git Push*****\n" +
                        "    git add .\n" +
                        "    git commit -m \"any message\"\n" +
                        "    git push\n" +
                        "****GIT PULL\n" +
                        "    git pull gets latest github code in our local\n" +
                        "    git pull = git fetch + git merge\n" +
                        "****CONFLICT\n" +
                        "    When we try to merge the code that are in the - SAME spot with DIFFERENT codes -\n" +
                        "****How to Resolve conflict?\n" +
                        "    Manually fix : remove the illegal characters(error message)\n" +
                        "    create a new commit(add, commit)\n" +
                        "    then push\n" +
                        "****To minimize conflict, we can clone the project, add our new code quickly, then commit then push\n" +
                        "    git clone https://github.com/abayramus/first_git_project.git\n" +
                        "    add your new codes\n" +
                        "    git add .\n" +
                        "    git commit -m\n" +
                        "    git push\n" +
                        "********************DAY 2*****************************************************\n" +
                        "BRANCHING\n" +
                        "git branch -a -> show me all branch\n" +
                        "git branch ahmet -> create ahmet branch\n" +
                        "git checkout ahmet -> switched to ahmet branch\n" +
                        "created a code : MySixthClass\n" +
                        "create a new commit and push\n" +
                        "    git add .\n" +
                        "    git commit -m \"message\"\n" +
                        "    git push --set-upstream origin ahmet\n" +
                        "Then codes will be in the remote ahmet branch\n"
        );
    }
}
