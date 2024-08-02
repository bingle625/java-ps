#!/bin/bash

# 사용자로부터 클래스 이름 입력받기
read -p "Enter the class name: " CLASS_NAME

# 클래스 이름이 비어 있는지 확인
if [ -z "$CLASS_NAME" ]; then
    echo "Class name cannot be empty."
    exit 1
fi

PACKAGE_DIR="src/problems"
CLASS_FILE="${PACKAGE_DIR}/${CLASS_NAME}.java"

# 디렉토리가 존재하지 않으면 생성
mkdir -p $PACKAGE_DIR

# 클래스 파일 생성
cat <<EOF > $CLASS_FILE
package problems;

public class $CLASS_NAME {
    public void solve() {
        System.out.println("Solving $CLASS_NAME");
        // 문제 해결 코드 작성
    }
}
EOF

echo "Class $CLASS_NAME created at $CLASS_FILE"