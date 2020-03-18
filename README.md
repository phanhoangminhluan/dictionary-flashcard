# Dictionary x Flashcard
In this project, we have 3 independent sub-projects. To enhance maintainability as well as readability, i have just applied git submodule for this project.
For further information about git submodule, you can find your answer here: https://git-scm.com/book/en/v2/Git-Tools-Submodules
### How to clone this project ?
1. Create a folder in your local.
2. Open CMD (on Windows) or Terminal (on MacOS) on that folder.
3. Clone this project by these commands below. Then, 3 folders namely dictionary-backend, dictionary-frontend, dictionary-mobile shall be appeared.
```
git clone https://github.com/phanhoangminhluan/dictionary-flashcard
git submodule init
git submodule update
```
4. Open Github Desktop, choose Current Repository > Add > Add Existing Repository...
5. Navigate to folder that you are responsible on. For example, i'm responsible on backend, so i'm gonna select dictionary-backend folder.


### How to commit in sub-project ?
1. Open Github Desktop, choose Current Repository, then select approritate project that you are responsible on and press commit
2. Then, choose Current Repository, then select dictionary-flashcard project, commit the reference of the project that you are responsible for

### How to use backend API for implementing features related to Flashcard
At server side, it detects user by using JWT. That is the reason why you have to attach authorization in header of every request to backend.
#### CardSet (a list of cards)
1. **To get all cardset (of a user, obviously)**
<br>Link: GET /dictionary-flashcard/card-set/
2. **To get cardset by user (it is well-noted that the cardset you wanna get, it must be belonged to user, which is detected by JWT)**
<br>Link: GET /dictionary-flashcard/card-set/{cardSetId}
3. **To add cardset with a list of cards**
<br>Link: POST /dictionary-flashcard/card-set/custom
<br>Body: 
```
{
  "name": "string",
  "cards": [
    {
      "term": "string",
      "definition": "string"
    }
  ]
}
```
4. **To update cardset (only update its name)**
<br>Link: PUT /dictionary-flashcard/card-set/custom
<br>Body:
```
{
  "id": "string",
  "name": "string"
}
```
5. **To delete cardset**
<br>Link: DELETE /dictionary-flashcard/card-set/{cardSetId}
#### Card
1. **To get a card by id**
<br>Link: GET /dictionary-flashcard/card/{cardId}
2. **To add cards (only add many cards)**
<br>Link: POST /dictionary-flashcard/card/cards
<br>Body: 
```
{
  "cardSetId": "string",
  "cards": [
    {
      "definition": "string",
      "term": "string"
    }
  ]
}
```
2. **To update a card**
<br>Link: PUT /dictionary-flashcard/card/
<br>Body: 
```
{
  "cardSetId": "string",
  "definition": "string",
  "id": "string",
  "term": "string"
}
```
3. **To delete a card**
<br>Link: /dictionary-flashcard/card/{cardId}
#### CardSetSession (The purpose of this object is to save the learning progress of every cardsets which are indicated by the number of remember or forget)
1. **To get all cardSetSession**
<br>Link: GET /dictionary-flashcard/card-set-session/
2. **To get by id**
<br>Link: GET /dictionary-flashcard/card-set-session/{cardSetSessionId}

#### Flashcard (This class is presented for main flow of flashcard feature which comprises learn, forget, remmember and reset progress
1. **To learn a flashcard**
<br>Link: POST /dictionary-flashcard/flashcard/learn/{cardSetId}
2. **To remember a word in that cardset**
<br>Link: PUT /dictionary-flashcard/flashcard/remember/{cardSetSessionId}/{cardId}
3. **To forget a word in that cardset**
<br>Link: PUT /dictionary-flashcard/flashcard/forget/{cardSetSessionId}/{cardId}
4. **To reset the learning progress of a carset**
<br>Link: GET /dictionary-flashcard/flashcard/reset-progress/{cardSetId}
5. **To count the number of remmeber and forget card in a card session
<br> Link: GET /dictionary-flashcard/flashcard/count/{cardSetId}

