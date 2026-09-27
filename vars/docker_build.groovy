def call(String imagename, String imagetag, String username)
{
  sh "dokcer build -t ${username}/${imagename}:${imagetag} ."
}
