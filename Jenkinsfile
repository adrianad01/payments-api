pipeline{
    environment {

    }
    agent any
    stages {
        stage('🚧 Build Project Without Tests') {
            steps {
                echo "Starting building the project..."
                sh 'mvn clean install -DskipTests'
                echo "Build completed successfully."
            }
        }
    }
}