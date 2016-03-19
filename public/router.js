var Backbone = require('backbone');
var LikesCollection = require('./likesCollection');
var LikesCollectionView = require('./LikesCollectionView');
var ThrillerCollection = require('./collection');
var ThrillerCollectionView = require('./collectionView');
var LoginView = require('./loginFormView');
var FormView = require('./formview');

module.exports = Backbone.Router.extend({
  subview: null,
  routes: {
    "": "homepage",
    "home": "homepage",
    "likes": "likes",
    "login": "login"
  },
  likes: function() {
    var that = this;
    var likesCol = new LikesCollection();
    //collection likesCol is still empty
    likesCol.fetch().then(function(data) {
      console.log(likesCol.models.length); //data is ready
      that.renderSubview(new LikesCollectionView({collection: likesCol}));
    });
  },
  homepage: function() {
    var that = this;

    var loginForm = new LoginView({});
    loginForm.render();

    var thrillerCol = new ThrillerCollection();
    //collection thrillerCol is still empty
    thrillerCol.fetch().then(function(data) {
      console.log(thrillerCol.models.length); //data is ready
      that.renderSubview(new ThrillerCollectionView({collection: thrillerCol}));
<<<<<<< HEAD
      that.renderSubview(new FormView({}));
=======
      var newForm = new FormView({collection: thrillerCol});
      // var loginForm = new LoginView({});
      newForm.render();
>>>>>>> 5d31a85e824c8d68aa8eeb749ca3a4ffbfd39174
    });
  },
  login: function() {
    var that = this;
    var loginForm = new LoginView();
    loginView.fetch().then(function(data) {
      that.renderSubview(new LoginView({view: loginView}));
    });
  },
  renderSubview: function(subview) {
    this.subview && this.subview.remove();
    this.subview = subview;
  }

});
