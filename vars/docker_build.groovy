def call(String imagename, String imagetag, String username)
{
  sh "docker build -t ${username}/${imagename}:${imagetag} ."
}
