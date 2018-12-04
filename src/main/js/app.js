const React = require('react');
const ReactDOM = require('react-dom');

import PostsBuilder from './posts/postsBuilder'
import PostForm from './form'

class App extends React.Component {

  render() {
    return (
      <div className="AppDiv">
        <PostsBuilder />
        <PostForm />
      </div>
    )
  }
}

ReactDOM.render(<App />,document.getElementById('app'))
