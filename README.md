# Android Project 3 - *Flixter*

Submitted by: **Brendan Clayton**

**Flixter** is a movie browsing app that allows users to browse movies currently playing in theaters.

Time spent: **6** hours spent in total

## Required Features

The following **required** functionality is completed:

- [x] **Make a request to [The Movie Database API's `now_playing`](https://developers.themoviedb.org/3/movies/get-now-playing) endpoint to get a list of current movies**
- [x] **Parse through JSON data and implement a RecyclerView to display all movies**
- [x] **Use Glide to load and display movie poster images**

The following **optional** features are implemented:

- [x] Improve and customize the user interface through styling and coloring
- [ ] Implement orientation responsivity
  - App should neatly arrange data in both landscape and portrait mode
- [ ] Implement Glide to display placeholder graphics during loading
  - Note: this feature is difficult to capture in a GIF without throttling internet speeds.  Instead, include an additional screencap of your Glide code implementing the feature.  (<10 lines of code)

The following **additional** features are implemented:

- [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

![flixter](https://user-images.githubusercontent.com/69495267/218372425-ef176c2d-b99d-4a65-aedd-2c7a1772558a.gif)

GIF created with
[ScreenToGif](https://www.screentogif.com/) for Windows
## Notes

The 1 time I got stuck during this project was getting the JSON information from the API request and putting it into a list. The trouble I was having was that
I tried to make it a JSON object, which did not work because it had to be a JSON array. However, when I tried calling json.jsonArray.get() it wasn't working.
Thats when I found out that the correct call was json.jsonObject.getJSONArray. It was a little tough finding information on this subject and trying to call
the right method.

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
