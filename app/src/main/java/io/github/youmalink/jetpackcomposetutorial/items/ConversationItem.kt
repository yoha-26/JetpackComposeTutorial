package io.github.youmalink.jetpackcomposetutorial.items

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.youmalink.jetpackcomposetutorial.Message
import io.github.youmalink.jetpackcomposetutorial.MessageCard
import io.github.youmalink.jetpackcomposetutorial.SampleData
import io.github.youmalink.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message = message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation(){
    JetpackComposeTutorialTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}
