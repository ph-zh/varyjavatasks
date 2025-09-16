public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии

/* Вывод должен получиться таким:
Post{title='xxx', content.length='x', tags=[x,x],
comments=[PostComment{text='x!', whoLiked=[x, x]},
PostComment{text='x', whoLiked=[x,x]},
PostComment{text='x', whoLiked=null}]} */

}