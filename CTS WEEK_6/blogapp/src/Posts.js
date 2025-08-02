import React from 'react';
import Post from './Post';
class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state={
            posts:[],
            hasError:false
        };
    }
componentDidMount(){
    this.loadPosts();
}
loadPosts(){
    fetch('https://jsonplaceholder.typicode.com/posts')
    .then(res=>res.json())
    .then(data=> {
        this.setState({posts:data});
    })
    .catch(error=> {
        console.error("Fetch error:",error);
        this.setState({hasError:true});
    });
}
componentDidCatch(error,info){
    alert("something went wrong: "+error);
}
render(){
    return(
        <div>
            <h1>Posts</h1>
            {this.state.hasError ? (
                <p style={{color:"red"}}>Error loading posts.</p>
            ):(
            this.state.posts.map(post=>(
                <Post key={post.id} title={post.title} body={post.body} />
            ))
            )}
        </div>
    );
}
}
export default Posts;
